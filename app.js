// Application State
let currentUser = null;
let tasks = [];
let editingTaskId = null;

// DOM Elements
const authScreen = document.getElementById("auth-screen");
const dashboardScreen = document.getElementById("dashboard-screen");
const loginForm = document.getElementById("login-form");
const registerForm = document.getElementById("register-form");
const taskModal = document.getElementById("task-modal");
const confirmModal = document.getElementById("confirm-modal");
const taskForm = document.getElementById("task-form");

// Initialize Application
document.addEventListener("DOMContentLoaded", function () {
  initializeApp();
  setupEventListeners();
  loadSampleData();
});

function initializeApp() {
  // Check if user is already logged in
  const session = getFromStorage("currentSession");
  if (session && session.userId) {
    currentUser = session;
    showDashboard();
  } else {
    showAuthScreen();
  }
}

function loadSampleData() {
  // Load sample users if not exist
  const users = getFromStorage("users") || [];
  if (users.length === 0) {
    const sampleUsers = [{ id: 1, username: "demo", password: "demo123" }];
    saveToStorage("users", sampleUsers);
  }

  // Load sample tasks if not exist
  const allTasks = getFromStorage("tasks") || [];
  if (allTasks.length === 0) {
    const sampleTasks = [
      {
        id: 1,
        userId: 1,
        title: "Completar proyecto",
        description: "Finalizar el desarrollo de la aplicación MiTareas",
        status: "pendiente",
        dueDate: "2025-06-15",
        createdAt: "2025-05-31",
      },
      {
        id: 2,
        userId: 1,
        title: "Revisar documentación",
        description: "Revisar y actualizar la documentación del proyecto",
        status: "pendiente",
        dueDate: "2025-06-01",
        createdAt: "2025-05-30",
      },
    ];
    saveToStorage("tasks", sampleTasks);
  }
}

function setupEventListeners() {
  // Auth tabs
  document.querySelectorAll(".auth-tab").forEach((tab) => {
    tab.addEventListener("click", function () {
      switchAuthTab(this.dataset.tab);
    });
  });

  // Auth forms
  if (loginForm) {
    loginForm.addEventListener("submit", handleLogin);
  }
  if (registerForm) {
    registerForm.addEventListener("submit", handleRegister);
  }

  // Dashboard actions - use delegation to ensure they work
  document.addEventListener("click", function (e) {
    if (e.target.id === "logout-btn") {
      handleLogout();
    } else if (e.target.id === "new-task-btn") {
      showTaskModal();
    }
  });

  // Filter change
  document.addEventListener("change", function (e) {
    if (e.target.id === "filter-status") {
      filterTasks();
    }
  });

  // Task form
  if (taskForm) {
    taskForm.addEventListener("submit", handleTaskSubmit);
  }

  // Modal close handlers
  document.addEventListener("keydown", function (e) {
    if (e.key === "Escape") {
      hideTaskModal();
      hideConfirmModal();
    }
  });
}

// Authentication Functions
function switchAuthTab(tab) {
  document
    .querySelectorAll(".auth-tab")
    .forEach((t) => t.classList.remove("active"));
  document
    .querySelectorAll(".auth-form")
    .forEach((f) => f.classList.remove("active"));

  const tabElement = document.getElementById(`${tab}-tab`);
  const formElement = document.getElementById(`${tab}-form`);

  if (tabElement) tabElement.classList.add("active");
  if (formElement) formElement.classList.add("active");

  clearAuthMessage();
}

function handleLogin(e) {
  e.preventDefault();

  const username = document.getElementById("login-username").value.trim();
  const password = document.getElementById("login-password").value;

  if (!username || !password) {
    showAuthMessage("Por favor, completa todos los campos", "error");
    return;
  }

  const user = loginUser(username, password);
  if (user) {
    currentUser = user;
    saveToStorage("currentSession", user);
    showAuthMessage("Inicio de sesión exitoso", "success");
    setTimeout(() => showDashboard(), 1000);
  } else {
    showAuthMessage("Usuario o contraseña incorrectos", "error");
  }
}

function handleRegister(e) {
  e.preventDefault();

  const username = document.getElementById("register-username").value.trim();
  const password = document.getElementById("register-password").value;
  const confirmPassword = document.getElementById("register-confirm").value;

  if (!username || !password || !confirmPassword) {
    showAuthMessage("Por favor, completa todos los campos", "error");
    return;
  }

  if (password !== confirmPassword) {
    showAuthMessage("Las contraseñas no coinciden", "error");
    return;
  }

  if (password.length < 3) {
    showAuthMessage("La contraseña debe tener al menos 3 caracteres", "error");
    return;
  }

  try {
    const result = registerUser(username, password);
    if (result.success) {
      showAuthMessage("Registro exitoso. Iniciando sesión...", "success");
      setTimeout(() => {
        currentUser = result.user;
        saveToStorage("currentSession", result.user);
        showDashboard();
      }, 1500);
    } else {
      showAuthMessage(result.message, "error");
    }
  } catch (error) {
    console.error("Registration error:", error);
    showAuthMessage("Error durante el registro. Inténtalo de nuevo.", "error");
  }
}

function handleLogout() {
  try {
    currentUser = null;
    tasks = [];
    removeFromStorage("currentSession");
    showAuthMessage("Sesión cerrada exitosamente", "success");
    showAuthScreen();
  } catch (error) {
    console.error("Logout error:", error);
    // Force logout anyway
    currentUser = null;
    tasks = [];
    showAuthScreen();
  }
}

function loginUser(username, password) {
  try {
    const users = getFromStorage("users") || [];
    const user = users.find(
      (u) => u.username === username && u.password === password
    );
    return user ? { id: user.id, username: user.username } : null;
  } catch (error) {
    console.error("Login error:", error);
    return null;
  }
}

function registerUser(username, password) {
  try {
    const users = getFromStorage("users") || [];

    if (users.find((u) => u.username === username)) {
      return { success: false, message: "El usuario ya existe" };
    }

    const newUser = {
      id: Date.now(),
      username: username,
      password: password,
    };

    users.push(newUser);
    saveToStorage("users", users);

    return {
      success: true,
      user: { id: newUser.id, username: newUser.username },
    };
  } catch (error) {
    console.error("Registration process error:", error);
    return { success: false, message: "Error durante el registro" };
  }
}

function isAuthenticated() {
  return currentUser !== null;
}

// Screen Management
function showAuthScreen() {
  if (authScreen) authScreen.classList.remove("hidden");
  if (dashboardScreen) dashboardScreen.classList.add("hidden");

  // Clear forms
  if (loginForm) loginForm.reset();
  if (registerForm) registerForm.reset();
  clearAuthMessage();
}

function showDashboard() {
  if (!isAuthenticated()) {
    showAuthScreen();
    return;
  }

  if (authScreen) authScreen.classList.add("hidden");
  if (dashboardScreen) dashboardScreen.classList.remove("hidden");

  const greetingElement = document.getElementById("user-greeting");
  if (greetingElement) {
    greetingElement.textContent = `Bienvenido, ${currentUser.username}`;
  }

  loadUserTasks();
  checkOverdueTasks();
  renderTasks();
  updateTaskStats();
}

// Task Management Functions
function loadUserTasks() {
  try {
    const allTasks = getFromStorage("tasks") || [];
    tasks = allTasks.filter((task) => task.userId === currentUser.id);
  } catch (error) {
    console.error("Error loading tasks:", error);
    tasks = [];
  }
}

function saveAllTasks() {
  try {
    const allTasks = getFromStorage("tasks") || [];
    const otherUserTasks = allTasks.filter(
      (task) => task.userId !== currentUser.id
    );
    const updatedTasks = [...otherUserTasks, ...tasks];
    saveToStorage("tasks", updatedTasks);
    return true;
  } catch (error) {
    console.error("Error saving tasks:", error);
    return false;
  }
}

function createTask(title, description, dueDate) {
  if (!title.trim()) {
    showNotification("El título es obligatorio", "error");
    return false;
  }

  try {
    const newTask = {
      id: Date.now(),
      userId: currentUser.id,
      title: title.trim(),
      description: description.trim(),
      status: "pendiente",
      dueDate: dueDate || null,
      createdAt: formatDate(new Date()),
    };

    tasks.push(newTask);
    const saved = saveAllTasks();

    if (saved) {
      showNotification("Tarea creada exitosamente", "success");
      return true;
    } else {
      showNotification("Error al guardar la tarea", "error");
      return false;
    }
  } catch (error) {
    console.error("Error creating task:", error);
    showNotification("Error al crear la tarea", "error");
    return false;
  }
}

function updateTask(taskId, updates) {
  try {
    const taskIndex = tasks.findIndex((task) => task.id === taskId);
    if (taskIndex === -1) {
      showNotification("Tarea no encontrada", "error");
      return false;
    }

    tasks[taskIndex] = { ...tasks[taskIndex], ...updates };
    const saved = saveAllTasks();

    if (saved) {
      showNotification("Tarea actualizada exitosamente", "success");
      return true;
    } else {
      showNotification("Error al actualizar la tarea", "error");
      return false;
    }
  } catch (error) {
    console.error("Error updating task:", error);
    showNotification("Error al actualizar la tarea", "error");
    return false;
  }
}

function deleteTask(taskId) {
  try {
    const taskIndex = tasks.findIndex((task) => task.id === taskId);
    if (taskIndex === -1) {
      showNotification("Tarea no encontrada", "error");
      return false;
    }

    tasks.splice(taskIndex, 1);
    const saved = saveAllTasks();

    if (saved) {
      showNotification("Tarea eliminada exitosamente", "success");
      return true;
    } else {
      showNotification("Error al eliminar la tarea", "error");
      return false;
    }
  } catch (error) {
    console.error("Error deleting task:", error);
    showNotification("Error al eliminar la tarea", "error");
    return false;
  }
}

function markTaskCompleted(taskId) {
  const result = updateTask(taskId, { status: "finalizada" });
  if (result) {
    renderTasks();
  }
  return result;
}

function checkOverdueTasks() {
  try {
    const today = new Date().toISOString().split("T")[0];
    let updatedCount = 0;

    tasks.forEach((task) => {
      if (task.status === "pendiente" && task.dueDate && task.dueDate < today) {
        task.status = "finalizada";
        updatedCount++;
      }
    });

    if (updatedCount > 0) {
      saveAllTasks();
    }
  } catch (error) {
    console.error("Error checking overdue tasks:", error);
  }
}

// Task Form Handling
function showTaskModal(taskId = null) {
  editingTaskId = taskId;
  const modal = document.getElementById("task-modal");
  const title = document.getElementById("modal-title");
  const form = document.getElementById("task-form");

  if (!modal || !title || !form) {
    console.error("Modal elements not found");
    return;
  }

  try {
    if (taskId) {
      const task = tasks.find((t) => t.id === taskId);
      if (task) {
        title.textContent = "Editar Tarea";
        document.getElementById("task-id").value = task.id;
        document.getElementById("task-title").value = task.title;
        document.getElementById("task-description").value = task.description;
        document.getElementById("task-due-date").value = task.dueDate || "";
        document.getElementById("save-task-btn").textContent = "Actualizar";
      }
    } else {
      title.textContent = "Nueva Tarea";
      form.reset();
      document.getElementById("save-task-btn").textContent = "Guardar";
    }

    modal.classList.remove("hidden");
    const titleInput = document.getElementById("task-title");
    if (titleInput) {
      setTimeout(() => titleInput.focus(), 100);
    }
  } catch (error) {
    console.error("Error showing task modal:", error);
  }
}

function hideTaskModal() {
  const modal = document.getElementById("task-modal");
  const form = document.getElementById("task-form");

  if (modal) modal.classList.add("hidden");
  if (form) form.reset();
  editingTaskId = null;
}

function handleTaskSubmit(e) {
  e.preventDefault();

  try {
    const title = document.getElementById("task-title").value;
    const description = document.getElementById("task-description").value;
    const dueDate = document.getElementById("task-due-date").value;

    let success = false;

    if (editingTaskId) {
      success = updateTask(editingTaskId, {
        title: title.trim(),
        description: description.trim(),
        dueDate: dueDate || null,
      });
    } else {
      success = createTask(title, description, dueDate);
    }

    if (success) {
      hideTaskModal();
      renderTasks();
      updateTaskStats();
    }
  } catch (error) {
    console.error("Error handling task submit:", error);
    showNotification("Error al procesar la tarea", "error");
  }
}

// Task Rendering
function renderTasks() {
  try {
    const taskList = document.getElementById("task-list");
    const emptyState = document.getElementById("empty-state");
    const filter = document.getElementById("filter-status");

    if (!taskList || !emptyState) {
      console.error("Task list elements not found");
      return;
    }

    const filterValue = filter ? filter.value : "all";

    let filteredTasks = tasks;
    if (filterValue !== "all") {
      filteredTasks = tasks.filter((task) => task.status === filterValue);
    }

    if (filteredTasks.length === 0) {
      taskList.style.display = "none";
      emptyState.classList.remove("hidden");
      return;
    }

    taskList.style.display = "block";
    emptyState.classList.add("hidden");

    // Sort tasks: pending first, then by due date
    filteredTasks.sort((a, b) => {
      if (a.status !== b.status) {
        return a.status === "pendiente" ? -1 : 1;
      }
      if (a.dueDate && b.dueDate) {
        return new Date(a.dueDate) - new Date(b.dueDate);
      }
      return new Date(b.createdAt) - new Date(a.createdAt);
    });

    taskList.innerHTML = filteredTasks
      .map((task) => renderTaskItem(task))
      .join("");

    // Add event listeners for task actions
    addTaskEventListeners();
  } catch (error) {
    console.error("Error rendering tasks:", error);
  }
}

function addTaskEventListeners() {
  // Use event delegation for task actions
  document.addEventListener("click", function (e) {
    if (e.target.classList.contains("complete-task-btn")) {
      const taskId = parseInt(e.target.dataset.taskId);
      markTaskCompleted(taskId);
    } else if (e.target.classList.contains("edit-task-btn")) {
      const taskId = parseInt(e.target.dataset.taskId);
      showTaskModal(taskId);
    } else if (e.target.classList.contains("delete-task-btn")) {
      const taskId = parseInt(e.target.dataset.taskId);
      confirmDeleteTask(taskId);
    }
  });
}

function renderTaskItem(task) {
  try {
    const isTaskOverdue =
      task.status === "pendiente" && task.dueDate && isOverdue(task.dueDate);
    const overdueClass = isTaskOverdue ? "overdue" : "";

    return `
            <div class="task-item ${overdueClass}">
                <div class="task-header">
                    <h3 class="task-title">${escapeHtml(task.title)}</h3>
                    <div class="task-status">
                        ${renderTaskStatus(task.status)}
                    </div>
                </div>
                ${
                  task.description
                    ? `<p class="task-description">${escapeHtml(
                        task.description
                      )}</p>`
                    : ""
                }
                <div class="task-meta">
                    <div class="task-due-date ${
                      isTaskOverdue ? "overdue" : ""
                    }">
                        ${
                          task.dueDate
                            ? `📅 ${formatDisplayDate(task.dueDate)}`
                            : "Sin fecha límite"
                        }
                    </div>
                    <div class="task-actions-group">
                        ${
                          task.status === "pendiente"
                            ? `
                            <button class="btn btn--sm btn--secondary task-action-btn complete-task-btn" data-task-id="${task.id}">
                                ✓ Completar
                            </button>
                        `
                            : ""
                        }
                        <button class="btn btn--sm btn--outline task-action-btn edit-task-btn" data-task-id="${
                          task.id
                        }">
                            ✏️ Editar
                        </button>
                        <button class="btn btn--sm btn--outline task-action-btn delete-task-btn" data-task-id="${
                          task.id
                        }">
                            🗑️ Eliminar
                        </button>
                    </div>
                </div>
            </div>
        `;
  } catch (error) {
    console.error("Error rendering task item:", error);
    return '<div class="task-item">Error rendering task</div>';
  }
}

function renderTaskStatus(status) {
  const statusMap = {
    pendiente: "status--warning",
    finalizada: "status--success",
  };

  const statusText = {
    pendiente: "Pendiente",
    finalizada: "Completada",
  };

  return `<span class="status ${statusMap[status]}">${statusText[status]}</span>`;
}

function updateTaskStats() {
  try {
    const pendingCount = tasks.filter(
      (task) => task.status === "pendiente"
    ).length;
    const completedCount = tasks.filter(
      (task) => task.status === "finalizada"
    ).length;

    const pendingEl = document.getElementById("pending-count");
    const completedEl = document.getElementById("completed-count");

    if (pendingEl) pendingEl.textContent = pendingCount;
    if (completedEl) completedEl.textContent = completedCount;
  } catch (error) {
    console.error("Error updating task stats:", error);
  }
}

function filterTasks() {
  renderTasks();
}

// Confirmation Modal
function confirmDeleteTask(taskId) {
  const task = tasks.find((t) => t.id === taskId);
  if (!task) return;

  showConfirmModal(
    `¿Estás seguro de que deseas eliminar la tarea "${task.title}"?`,
    () => {
      deleteTask(taskId);
      renderTasks();
      updateTaskStats();
      hideConfirmModal();
    }
  );
}

function showConfirmModal(message, onConfirm) {
  const modal = document.getElementById("confirm-modal");
  const messageEl = document.getElementById("confirm-message");
  const confirmBtn = document.getElementById("confirm-action-btn");

  if (messageEl) messageEl.textContent = message;
  if (confirmBtn) confirmBtn.onclick = onConfirm;
  if (modal) modal.classList.remove("hidden");
}

function hideConfirmModal() {
  const modal = document.getElementById("confirm-modal");
  if (modal) modal.classList.add("hidden");
}

// Utility Functions
function formatDate(date) {
  return date.toISOString().split("T")[0];
}

function formatDisplayDate(dateString) {
  try {
    const date = new Date(dateString);
    return date.toLocaleDateString("es-ES", {
      day: "numeric",
      month: "short",
      year: "numeric",
    });
  } catch (error) {
    return dateString;
  }
}

function isOverdue(dueDate) {
  try {
    const today = new Date().toISOString().split("T")[0];
    return dueDate < today;
  } catch (error) {
    return false;
  }
}

function escapeHtml(text) {
  try {
    const div = document.createElement("div");
    div.textContent = text;
    return div.innerHTML;
  } catch (error) {
    return text;
  }
}

// Storage Functions
function saveToStorage(key, data) {
  try {
    localStorage.setItem(key, JSON.stringify(data));
  } catch (error) {
    console.error("Error saving to storage:", error);
  }
}

function getFromStorage(key) {
  try {
    const data = localStorage.getItem(key);
    return data ? JSON.parse(data) : null;
  } catch (error) {
    console.error("Error reading from storage:", error);
    return null;
  }
}

function removeFromStorage(key) {
  try {
    localStorage.removeItem(key);
  } catch (error) {
    console.error("Error removing from storage:", error);
  }
}

// Notification System
function showNotification(message, type = "info") {
  try {
    const container = document.getElementById("notification-container");
    if (!container) return;

    const notification = document.createElement("div");
    notification.className = `notification ${type}`;
    notification.textContent = message;

    container.appendChild(notification);

    // Auto remove after 5 seconds
    setTimeout(() => {
      if (notification.parentNode) {
        notification.parentNode.removeChild(notification);
      }
    }, 5000);
  } catch (error) {
    console.error("Error showing notification:", error);
  }
}

function showAuthMessage(message, type) {
  const messageEl = document.getElementById("auth-message");
  if (messageEl) {
    messageEl.textContent = message;
    messageEl.className = `auth-message ${type}`;
  }
}

function clearAuthMessage() {
  const messageEl = document.getElementById("auth-message");
  if (messageEl) {
    messageEl.textContent = "";
    messageEl.className = "auth-message";
  }
}

// Form Validation
function validateForm(formData) {
  const errors = [];

  if (!formData.title || !formData.title.trim()) {
    errors.push("El título es obligatorio");
  }

  if (formData.dueDate && new Date(formData.dueDate) < new Date()) {
    errors.push("La fecha límite no puede ser en el pasado");
  }

  return {
    isValid: errors.length === 0,
    errors: errors,
  };
}
