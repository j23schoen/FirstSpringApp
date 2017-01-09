package com.example

/**
 * Created by j23schoen on 1/8/17.
 */
class Lift {

    Long id
    String typeOfLift

    def String toString() {
        return "id: " + id + "\n " +
                "type of lift: " + typeOfLift
    }
}
