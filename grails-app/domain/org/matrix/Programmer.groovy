package org.matrix

class Programmer {

    static mapping = {
        table 'Programming_individual'
    }

    static constraints = {
        programmerId(unique: true, blank: false)
        programmerName(blank: false)
    }

    static hasMany = [programmers: Programmer]

    String programmerId
    String programmerName
}
