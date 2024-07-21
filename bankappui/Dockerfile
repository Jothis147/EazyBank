# Stage 1: Build the Angular app
FROM node:latest AS build

WORKDIR /app

COPY . .

RUN npm install
RUN npm run build --prod

# Stage 2: Serve the Angular app
FROM nginx:alpine

COPY --from=build /app/dist/bank-app-ui /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
