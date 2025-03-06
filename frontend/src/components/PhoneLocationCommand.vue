<template>
    <v-card outlined>
        <v-card-title>
            PhoneLocation
        </v-card-title>

        <v-card-text>
            <Number label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <Number label="CustomerPhoneId" v-model="value.customerPhoneId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="phoneLocation"
            >
                PhoneLocation
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'PhoneLocationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = 0;
            this.value.customerPhoneId = 0;
        },
        watch: {
        },
        methods: {
            phoneLocation() {
                this.$emit('phoneLocation', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

