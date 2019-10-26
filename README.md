# two-camunda-instances
Maven parent with two modules, each creating a complete separate camunda BPM instance (cam1/cam2) against PostgreSQL.

DB schemas, db credentials and web portal users used are *cam1/cam1* and *cam2/cam2*

Runs against PostgreSQL. DB schemas cam1 and cam2 with permissions for the users need to exist. Schemas will be created automatically.

(Inspiration: https://stackoverflow.com/questions/58196241/can-i-have-two-spring-boot-camunda-applications-in-same-db-with-different-schema)
