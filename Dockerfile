FROM postgres:latest
ENV POSTGRES_PASSWORD password
ENV POSTGRES_DB employee
COPY ./postgres_init.sql /docker-entrypoint-initdb.d/postgres_init.sql
EXPOSE 5432
