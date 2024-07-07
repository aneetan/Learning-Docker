#Using a official runtime as our parent image (This will be our environment)
FROM node:22-alpine3.20    

#Set the working directory
WORKDIR /app

#copy the local files to working directory
#Workdir nadeko vaye hamile COPY . /app lekhnuparthyo
COPY . .

# Install dependencies
RUN npm install


#provide command to run the file
#cmd lekhda array ko form ma lekhnuparxa
CMD [ "npm", "run", "start:dev"]
