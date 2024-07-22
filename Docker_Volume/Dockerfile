FROM 'node:latest'

WORKDIR /app

#Copy the packages
#first time ma execute garxa, second bata cache bata ligxa
#helps in optimizing the code
COPY package.json .

RUN npm install

#Copy other files
COPY . .

CMD [ "npm", "run", "start:dev"]