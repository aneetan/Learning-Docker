#Using a official runtime as our parent image (This will be our environment)
FROM node:21-alpine3.18    

#Set the working directory (Can be anything)
WORKDIR /app

#copy the local files to working directory
#Workdir nadeko vaye hamile COPY . /app lekhnuparthyo
COPY . .

# Install dependencies
RUN npm install

#provide command to run the file
#cmd lekhda array ko form ma lekhnuparxa
CMD [ "npm", "run", "start:dev"]
