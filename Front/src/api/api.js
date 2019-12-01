// import axios
import axios from 'axios'

import qs from 'qs'

// defind access address
//axios.defaults.baseURL = 'http://localhost:9091'
axios.defaults.headers = {'content-type': 'application/json'}

// defind methods

export const accessTest = (params) => {
	debugger
	return axios.post('/accessTest', params)
}