import Vuex from 'vuex'
import Vue from 'vue'

Vue.use(Vuex)


let store = new Vuex.Store({
    state: {
        count: 0,
        student: {
            name: '',
            id: '',
            socia: [],
            polit: '',
            unit: '',
            loaded: false,
            choseCours: []
        },
        grade: []
    },
    mutations: {
        increment(state) {
            state.count++
        },
        reduce(state) {
            state.count--
        },
        loadStudent(state, student) {
            console.log(student)
            state.student.name = student.name
            state.student.id = student.id
            state.student.polit = student.polit
            state.student.unit = student.unit
            state.student.socia =  typeof student.socia == 'object' ?  student.socia : student.socia.split("%")
            state.student.loaded = true
        },
        loadCours(state, cours) {
            state.student.choseCours = cours
        },
        loadGrade(state, grade) {
            state.grade = grade
        },
    
    }
})

export default store