<template>
    <div>
        <v-data-table
                :headers="headers"
                :items="values"
                :items-per-page="5"
                class="elevation-1"
        ></v-data-table>

        <v-col style="margin-bottom:40px;">
            <div class="text-center">
                <v-dialog v-model="openDialog" width="500">
                    <template v-slot:activator="{ on, attrs }">
                        <v-fab-transition>
                            <v-btn
                                    color="primary"
                                    fab
                                    dark
                                    large
                                    style="position:absolute; bottom: 5%; right: 2%; z-index:99"
                                    @click="openDialog=true;"
                            >
                                <v-icon v-bind="attrs" v-on="on">mdi-plus</v-icon>
                            </v-btn>
                        </v-fab-transition>
                    </template>

                    <RentRentService :offline="offline"  :isNew="true" :editMode="true" v-model="newValue" @add="append" v-if="tick"/>
                
                    <v-btn
                        class="gs-close-btn"
                        @click="closeDialog()"
                        depressed 
                        icon 
                        absolute
                    >
                        <v-icon>mdi-close</v-icon>
                    </v-btn>
                </v-dialog>
            </div>
        </v-col>
    </div>
</template>

<script>
    const axios = require('axios').default;
    import RentRentService from './../RentRentService.vue';

    export default {
        name: 'RentRentServiceManager',
        components: {
            RentRentService,
        },
        props: {
            offline: Boolean,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            values: [],
            headers: 
                [
                    { text: "id", value: "id" },
                    { text: "customerId", value: "customerId" },
                    { text: "rentPhoneId", value: "rentPhoneId" },
                    { text: "customerName", value: "customerName" },
                    { text: "fee", value: "fee" },
                    { text: "rentDays", value: "rentDays" },
                    { text: "rentDate", value: "rentDate" },
                    { text: "returnDate", value: "returnDate" },
                ],
            rentService : [],
            newValue: {},
            tick : true,
            openDialog : false,
        }),
        async created() {
            if(this.offline){
                if(!this.values) this.values = [];
                return;
            }

            var temp = await axios.get(axios.fixUrl('/rentservices'))
            temp.data._embedded.rentservices.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])
            this.values = temp.data._embedded.rentservices;

            this.newValue = {
                'customerId': 0,
                'rentPhoneId': 0,
                'customerName': '',
                'fee': 0,
                'rentDays': 0,
                'rentDate': '2025-03-06',
                'returnDate': '2025-03-06',
            }
        },
        methods: {
            closeDialog(){
                this.openDialog = false
            },
            append(value){
                this.tick = false
                this.newValue = {}
                this.values.push(value)
                
                this.$emit('input', this.values);

                this.$nextTick(function(){
                    this.tick=true
                })
            },
        }
    }
</script>

