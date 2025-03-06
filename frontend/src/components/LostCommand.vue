<template>
    <v-card outlined>
        <v-card-title>
            Lost
        </v-card-title>

        <v-card-text>
            <Number label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <Number label="CustomerPhoneId" v-model="value.customerPhoneId" :editMode="editMode"/>
            <String label="CustomerName" v-model="value.customerName" :editMode="editMode"/>
            <String label="PhoneNumber" v-model="value.phoneNumber" :editMode="editMode"/>
            <Date label="LostDate" v-model="value.lostDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="lost"
            >
                Lost
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
        name: 'LostCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = 0;
            this.value.customerPhoneId = 0;
            this.value.customerName = '';
            this.value.phoneNumber = '';
            this.value.lostDate = '2025-03-06';
        },
        watch: {
        },
        methods: {
            lost() {
                this.$emit('lost', this.value);
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

