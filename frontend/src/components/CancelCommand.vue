<template>
    <v-card outlined>
        <v-card-title>
            Cancel
        </v-card-title>

        <v-card-text>
            <Number label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <Number label="CustomerPhoneId" v-model="value.customerPhoneId" :editMode="editMode"/>
            <Number label="Id" v-model="value.id" :editMode="editMode"/>
            <Date label="FoundDate" v-model="value.foundDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="cancel"
            >
                Cancel
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
        name: 'CancelCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = 0;
            this.value.customerPhoneId = 0;
            this.value.id = 0;
            this.value.foundDate = '2025-03-06';
        },
        watch: {
        },
        methods: {
            cancel() {
                this.$emit('cancel', this.value);
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

