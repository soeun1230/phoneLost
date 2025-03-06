<template>

    <v-data-table
        :headers="headers"
        :items="possibleRentPhone"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PossibleRentPhoneView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "phoneNumber", value: "phoneNumber" },
                { text: "phoneKind", value: "phoneKind" },
                { text: "status", value: "status" },
            ],
            possibleRentPhone : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/possibleRentPhones'))

            temp.data._embedded.possibleRentPhones.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.possibleRentPhone = temp.data._embedded.possibleRentPhones;
        },
        methods: {
        }
    }
</script>

