<template>
    <v-container class="text-center">
        <v-row>
            <v-col>
                用户名：
            </v-col>
            <v-col>
                <v-text-field label="请输入用户名" v-model="username" solo></v-text-field>
            </v-col>
        </v-row>
        <v-row>
            <v-col>
                密码：
            </v-col>
            <v-col>
                <v-text-field label="请输入密码" v-model="password" solo></v-text-field>
            </v-col>
        </v-row>
        <v-row>
            <v-col>
                <v-btn @click="onRegisterClick">
                    注册
                </v-btn>
            </v-col>
            <v-col>
                <v-btn @click="onLoginClick">
                    登录
                </v-btn>
            </v-col>
        </v-row>
        <v-alert type="success" v-model="isVisible">{{ret}}</v-alert>
    </v-container>
</template>

<script>
    import {createUser} from "../api/Register";
    import {checkUser} from "../api/Login";

    export default {
        name: "RegisterAndLogin",

        data() {
            return {
                username: "",
                password: "",
                isVisible: false,
                ret: "",
            }
        },

        methods: {
            onRegisterClick() {
                createUser({username: this.username, password: this.password}).then(
                    res => {
                        console.log(res);
                        this.ret = res;
                    }
                );
                this.isVisible = true;
            },

            onLoginClick() {
                checkUser({username: this.username, password: this.password}).then(
                    res => {
                        console.log(res);
                        this.ret = res;
                    }
                );
                this.isVisible = true;
            },
        }
    }
</script>

<style scoped>

</style>