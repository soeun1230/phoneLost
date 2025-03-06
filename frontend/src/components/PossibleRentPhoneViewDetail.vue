<template>

    <v-card outlined>
        <v-card-title>
            PossibleRentPhone # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="PhoneNumber" v-model="item.phoneNumber" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PhoneKind" v-model="item.phoneKind" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'PossibleRentPhoneViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/possibleRentPhones/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

