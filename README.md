# Docker-app
Docker를 사용한 서버 배포 



사용 언어
- JAVA 8



사용 기술
- spring-boot
- spring
- spring-security
- H2
- react


라이브러리
- lombok
- gradle


devOps
- AWS EC2
- nginx
- Docker


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


