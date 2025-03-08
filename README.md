## Setup instruction

### Backend

1. Install JDK 21
2. Install the dependencies and start the application.

```bash
mvn spring-boot:run
```

### Frontend

1. Change to Frontend directory.

```bash
cd ./frontend/
```

2. Create a .env file and insert the env variables.

```
VITE_BACKEND_API_URL=http://localhost:8080
```

3. Install the packages.

```bash
npm install
```

4. Start the application.

```bash
npm run dev
```
