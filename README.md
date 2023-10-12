# Docker
Docker를 사용한 서버 배포 



사용 언어
```
- JAVA 8
```

사용 기술
```
- springboot
- spring-security
- H2
- Mysql
```

라이브러리
```
- lombok
- gradle
- react
```

devOps
```
- AWS EC2
- nginx
- Docker
```

spring docker file 
```java 
FROM openjdk:8-alpine

WORKDIR traildir
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
```

react docker file 
```javascript
FROM node:16-alpine

WORKDIR /app

ENV PATH /app/node_modules/.bin:$PATH

COPY package.json ./
RUN npm install

COPY . ./
CMD ["npm", "start"]
```

docker-compose file
```docker 
services:
  nginx:
    depends_on:
      - db
      - server
      - client
    image: nginx:latest
    ports:
      - "80:80"
    restart: always
    volumes:
      - "./nginx/nginx.conf:/etc/nginx/nginx.conf"
  client:
    restart: always
    build:
      context: /home/ubuntu/trail-front
      dockerfile: Dockerfile
    ports:
      - "3000:3000" 
    container_name: clientcontainer
    depends_on:
      - server

  server:
    restart: restart
    build:
      context: /home/ubuntu/trail-server/demo
      dockerfile: Dockerfile
    links:
      - "db:traildb"
    ports:
      - "8080:8080" 
    container_name: servercontainer
    depends_on:
      - db
  db:
    image: mysql:5.7
    volumes:
      - ./traildb:/var/lib/mysql
    environment:
      - MYSQL_DATABASE=traildb
      - MYSQL_ROOT_PASSWORD=******
    ports:
      - "3306:3306"
    container_name: dbcontainer
```

![](https://github.com/greeneryjin/Docker/assets/87289562/0c746a9d-f14f-44ed-ad00-ebfa2fc8a118)
