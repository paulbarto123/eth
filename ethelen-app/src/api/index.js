import axios from "axios";

<<<<<<< HEAD:ethelen-app/src/api/index.js
const BASE_URL = 'http://localhost:8080/api/';
=======
const BASE_URL = 'http://localhost:8080/';
>>>>>>> 800caa1d7b8604f8bcc9c0d695483c05a5c5c8b2:src/api/index.js

export const ENDPIONTS = {
    Deposite: 'deposite',
    FOODITEM: 'FoodItem',
    ORDER: 'Order'
}

export const createAPIEndpoint = endpoint => {

    let url = BASE_URL + endpoint + '/';
    return {
        fetchAll: () => axios.get(url),
        fetchById: id => axios.get(url + id),
        create: newRecord => axios.post(url, newRecord),
        update: (id, updatedRecord) => axios.put(url + id, updatedRecord),
        delete: id => axios.delete(url + id)
    }
}