// import axios
import axios from 'axios'

import qs from 'qs'

// defind access address
axios.defaults.baseURL = 'http://192.1.2.112:9091'
axios.defaults.headers = {'content-type': 'application/json'}

// defind methods

export const accessTest = (params) => {
	debugger
	return axios.post('/accessTest', params)
}