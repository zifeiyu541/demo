<template>
  <v-app>
    <v-main>
      <HelloWorld/>
      <RegisterAndLogin/>
    </v-main>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld';
import RegisterAndLogin from "./components/RegisterAndLogin";

export default {
  name: 'App',

  components: {
    HelloWorld,
    RegisterAndLogin,
  },

  data: () => ({
    //
  }),
};
</script>
