import basePost from "./api"

let testApi = ()=> {
    //测试用例 可以组合使用
    //前一种是用来直传参数的 后一种是用来传json对象的
    basePost("https://localhost:8090/register?username=\"hh\"&password=\"123\"")
    basePost("https://localhost:8090/register", {username:"hh", password:"123"})
    
}

export default testApi