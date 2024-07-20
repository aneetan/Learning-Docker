FROM 'node:latest'

WORKDIR /app

#Copy the packages
COPY package.json .

RUN npm install

#Copy other files
COPY . .

CMD [ "npm", "run", "start"]