import axios from 'axios';


const baseURL =  '/api'



let basePost =  axios.create({
    method: 'post',
    headers: {
        "Access-Control-Allow-Origin": "*",
        "Content-Type":"application/json"
    },
    baseURL: '/api'
})

// export const login = (params) => {
//     return axios({
           
//             method: 'post',
//             url: 'http://localhost:8080/api/login',
//             data: params
//     })    
// }

// export const baseAxios = axios.create(
//     {
//         baseURL: "/api/"
//     }
// )import HelloWorld from '@/components/HelloWorld';

export default basePost