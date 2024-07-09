console.log("Hello world")

console.log("env", process.env.NODE_ENV)

const express = require ("express")

const app = express()

app.get("/", (req, res) => {
    res.send("Hello Docker")
});

app.listen(8080, () => {
    console.log("Running at 8080")
});
