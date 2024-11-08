import { Container, Table } from "react-bootstrap"
import { PetTable } from "./PetTable"
import { useEffect, useState } from "react"
import axios from "axios"
import { store } from "../../globalData/store"

export const PetContainer: React.FC = () => {
    //we'll store a state object that contains an Array of PetInterfaces
    //TODO: make the pet interface, but for now, we can just use an any[]
    const [pets, setPets] = useState([])

    //Defining a useEffect that calls the function that gets pets by userId
    useEffect(() => {
        getPetsByUserId()
    }, []) //this useEffect triggers on component load


    //The function that gets all pets with an axios GET request
    const getPetsByUserId = async () => {

        //axios GET request 
        //TODO: hardcoding user ID for now, but this will be the id of the logged in user
        const response = await axios.get("http://localhost:7777/pets/user/" + store.loggedInUser.userId)
        //TODO: then(), catch() etc

        //populate the pets state object
        setPets(response.data) //data holds the data send in the response body

        console.log(response.data)
    }


    return (
        <Container>
            {pets ? <PetTable pets={pets} /> : <div>No Data</div>}
        </Container>
    )
}