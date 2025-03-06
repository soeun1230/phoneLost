
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import LostLostServiceManager from "./components/listers/LostLostServiceCards"
import LostLostServiceDetail from "./components/listers/LostLostServiceDetail"

import RentRentServiceManager from "./components/listers/RentRentServiceCards"
import RentRentServiceDetail from "./components/listers/RentRentServiceDetail"

import CustomerphoneCustomerPhoneManager from "./components/listers/CustomerphoneCustomerPhoneCards"
import CustomerphoneCustomerPhoneDetail from "./components/listers/CustomerphoneCustomerPhoneDetail"

import PhoneStatusView from "./components/PhoneStatusView"
import PhoneStatusViewDetail from "./components/PhoneStatusViewDetail"
import CustomerCustomerManager from "./components/listers/CustomerCustomerCards"
import CustomerCustomerDetail from "./components/listers/CustomerCustomerDetail"

import CustomerInfoView from "./components/CustomerInfoView"
import CustomerInfoViewDetail from "./components/CustomerInfoViewDetail"
import RentphoneRentPhoneManager from "./components/listers/RentphoneRentPhoneCards"
import RentphoneRentPhoneDetail from "./components/listers/RentphoneRentPhoneDetail"

import PossibleRentPhoneView from "./components/PossibleRentPhoneView"
import PossibleRentPhoneViewDetail from "./components/PossibleRentPhoneViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/losts/lostServices',
                name: 'LostLostServiceManager',
                component: LostLostServiceManager
            },
            {
                path: '/losts/lostServices/:id',
                name: 'LostLostServiceDetail',
                component: LostLostServiceDetail
            },

            {
                path: '/rents/rentServices',
                name: 'RentRentServiceManager',
                component: RentRentServiceManager
            },
            {
                path: '/rents/rentServices/:id',
                name: 'RentRentServiceDetail',
                component: RentRentServiceDetail
            },

            {
                path: '/customerphones/customerPhones',
                name: 'CustomerphoneCustomerPhoneManager',
                component: CustomerphoneCustomerPhoneManager
            },
            {
                path: '/customerphones/customerPhones/:id',
                name: 'CustomerphoneCustomerPhoneDetail',
                component: CustomerphoneCustomerPhoneDetail
            },

            {
                path: '/customerphones/phoneStatuses',
                name: 'PhoneStatusView',
                component: PhoneStatusView
            },
            {
                path: '/customerphones/phoneStatuses/:id',
                name: 'PhoneStatusViewDetail',
                component: PhoneStatusViewDetail
            },
            {
                path: '/customers/customers',
                name: 'CustomerCustomerManager',
                component: CustomerCustomerManager
            },
            {
                path: '/customers/customers/:id',
                name: 'CustomerCustomerDetail',
                component: CustomerCustomerDetail
            },

            {
                path: '/customers/customerInfos',
                name: 'CustomerInfoView',
                component: CustomerInfoView
            },
            {
                path: '/customers/customerInfos/:id',
                name: 'CustomerInfoViewDetail',
                component: CustomerInfoViewDetail
            },
            {
                path: '/rentphones/rentPhones',
                name: 'RentphoneRentPhoneManager',
                component: RentphoneRentPhoneManager
            },
            {
                path: '/rentphones/rentPhones/:id',
                name: 'RentphoneRentPhoneDetail',
                component: RentphoneRentPhoneDetail
            },

            {
                path: '/rentphones/possibleRentPhones',
                name: 'PossibleRentPhoneView',
                component: PossibleRentPhoneView
            },
            {
                path: '/rentphones/possibleRentPhones/:id',
                name: 'PossibleRentPhoneViewDetail',
                component: PossibleRentPhoneViewDetail
            },


    ]
})
