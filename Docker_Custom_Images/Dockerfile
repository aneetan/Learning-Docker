# FROM "ubuntu"

# RUN apt-get update

# RUN apt-get upgrade -y

# RUN apt-get install figlet

FROM 'node:22-alpine3.19'

WORKDIR /app

#Copy the packages
COPY package.json .

RUN npm install

#Copy other files
COPY . .

CMD [ "npm", "run", "start:dev" ]