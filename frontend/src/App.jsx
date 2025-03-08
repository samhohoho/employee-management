import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [newTask, setNewTask] = useState({ title: '', description: '', completed: false });
  const [updateTask, setUpdateTask] = useState({ id: '', title: '', description: '', completed: false });
  const [taskGetId, setTaskGetId] = useState(null);
  const [taskDeleteId, setTaskDeleteId] = useState(null);

    const getTasks = async () => {
        const response = await fetch(`${import.meta.env.VITE_BACKEND_API_URL}/api/tasks`);
        const result = await response.json();
    }

    const createOneTask = async (newTask) => {
        const response = await fetch(`${import.meta.env.VITE_BACKEND_API_URL}/api/tasks`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(newTask)
        });
    }

    const updateOneTask = async (task) => {
        const response = await fetch(`${import.meta.env.VITE_BACKEND_API_URL}/api/tasks/${task.id}`, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(task)
        });
    }

    const deleteOneTask = async (id) => {
        const response = await fetch(`${import.meta.env.VITE_BACKEND_API_URL}/api/tasks/${id}`, {
            method: "DELETE",
        });
    }

  return (
    <>
      <div>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div style={{ "display": "flex"}}>
        <div>
            <div>
                <input
                type="text"
                placeholder="Task title"
                value={newTask.title}
                onChange={(e) => setNewTask({...newTask, title: e.target.value })}
                />
            </div>
            <div>
                <input
                type="text"
                placeholder="task description"
                value={newTask.description}
                onChange={(e) => setNewTask({...newTask, description: e.target.value })}
                />
            </div>
            <div>
                <input
                    type="checkbox"
                    checked={newTask.completed}
                    onChange={(e) => setNewTask({...newTask, completed: e.target.checked })}
                />
            </div>
        </div>
        <button onClick={() => createOneTask(newTask)}>Add One Task</button>
      </div>
      <br />
      <div style={{ "display": "flex"}}>
        <div>
            <div>
                <input
                    type="text"
                    placeholder="Task ID"
                    value={updateTask.id}
                    onChange={(e) => setUpdateTask({...updateTask, id: e.target.value })}
                />
            </div>
            <div>
                <input
                    type="text"
                    placeholder="Task title"
                    value={updateTask.title}
                    onChange={(e) => setUpdateTask({...updateTask, title: e.target.value })}
                />
            </div>
            <div>
                <input
                    type="text"
                    placeholder="Task description"
                    value={updateTask.description}
                    onChange={(e) => setUpdateTask({...updateTask, description: e.target.value })}
                />
            </div>
            <div>
                <input
                    type="checkbox"
                    checked={updateTask.completed}
                    onChange={(e) => setUpdateTask({...updateTask, completed: e.target.checked })}
                />
            </div>
        </div>
        <button onClick={() => updateOneTask(updateTask)}>Update One Task</button>
      </div>
      <br />
      <div style={{ "display": "flex"}}>
        <div>
            <div>
                <input
                    type="text"
                    placeholder="Task ID"
                    value={taskDeleteId}
                    onChange={(e) => setTaskDeleteId(e.target.value)}
                />
            </div>
        </div>
        <button onClick={() => deleteOneTask(taskDeleteId)}>Delete One Task</button>
      </div>
      <br />
      <div>
        <button onClick={getTasks}>Get All Tasks</button>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
