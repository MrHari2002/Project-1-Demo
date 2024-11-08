/* 
This is a basic implementation of a state
*/

//This is just an object that stores other objects or standalone variables

export const store: any = {
    //Let's store loggedInUser info (filled after successful login)

    loggedInUser: {
        userId: 0,
        username: "",
        role: ""
    },

    //We could have modeled this after a UserInterface, but I didn't 

    //Thinking about your 
    baseUrl: "http://localhost:7777/"



}