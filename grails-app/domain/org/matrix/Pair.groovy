package org.matrix

class Pair {

    static mapping = {
        table 'ThePairTable'
    }
    static hasMany = [pairs :Pair]
    String programmerName
    String pairProgrammerName
    String noOfTimesPaired
}
