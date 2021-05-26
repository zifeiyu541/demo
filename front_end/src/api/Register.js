import axios from "axios";

export const createUser = userInfo => {
    const { username, password } = userInfo;
    return axios.post('http://localhost:4040/user/register',
        {username, password}).then(res => {
            if (res.data) {
                return "注册成功";
            } else {
                return "注册失败";
            }
        });

}

