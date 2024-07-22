FROM 'node:latest'

WORKDIR /app

#Copy the packages
# COPY package.json .

COPY . .

RUN npm install

#Copy other files
# COPY . .

CMD [ "npm", "run", "start:dev"]