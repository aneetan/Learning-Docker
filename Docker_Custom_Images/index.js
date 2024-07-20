const express = require("express");
const Pool = require("pg-pool")

const app= express();

app.get("/", (req, res) =>{
    const pool = new Pool({
        host:"data",
        post:"8080",
        user: "user",
        password: "password",
        database: "mydb"
    });

    res.send("Hello world");
});

pool.connect().then(() =>{
    console.log("Connected database");
});


app.listen(8080, () =>{
    console.log("Server running on 8080")
});