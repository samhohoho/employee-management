docker run --name atoz-employee -e POSTGRES_PASSWORD=admin -p 5432:5432 -d postgres:latest
docker exec -it employee-management-postgres-employee-management-1 psql -U postgres         
