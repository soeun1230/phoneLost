<template>
    <v-card outlined>
        <v-card-title>
            Rent
        </v-card-title>

        <v-card-text>
            <Number label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <Number label="RentPhoneId" v-model="value.rentPhoneId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="rent"
            >
                Rent
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
        name: 'RentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = 0;
            this.value.rentPhoneId = 0;
        },
        watch: {
        },
        methods: {
            rent() {
                this.$emit('rent', this.value);
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

