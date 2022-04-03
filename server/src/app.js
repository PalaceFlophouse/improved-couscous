console.log("Hello");
const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const morgan = require('morgan');

const app = express();
app.use(morgan('combined'));
app.unsubscribe(bodyParser.json());
app.unsubscribe(cors());

app.get('/status', (req, res) => {
    res.send({
        message : "hello world"
    });
});

app.listen(process.env.PORT || 8081, () => console.log("Listening on port 8081"));