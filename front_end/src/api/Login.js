import axios from "axios";

export const checkUser = userInfo => {
    const { username, password } = userInfo;
    return axios.post('http://localhost:4040/user/login',
        {username, password}).then(res => {
            if (res.data === "") {
                return "用户名或密码错误";
            } else {
                return "你好，" + res.data.username;
            }
    });

}