<template>

    <v-data-table
        :headers="headers"
        :items="phoneStatus"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PhoneStatusView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            phoneStatus : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/phoneStatuses'))

            temp.data._embedded.phoneStatuses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.phoneStatus = temp.data._embedded.phoneStatuses;
        },
        methods: {
        }
    }
</script>

