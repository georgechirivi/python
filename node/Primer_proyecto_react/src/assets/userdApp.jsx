import { useEffect, useState } from "react";

export const UsersApp = () => {
    const [users, setUsers] = useState([])
    const fetchUsers = async() => {
    try{
        const response = await fetch('https://jsonplaceholder.typicode.com/users')
        const data = await response.json()
        setUsers(data)
    }catch(error){
        console.error(error)
    };
    }

    useEffect( () => {
        fetchUsers()
    }, [])
  return (
    <>
      <h1>Lista de usuarioas</h1>
      <ul>
        {users.map(user => <li key={user.id}>user.name</li>)}
      </ul>
    </>
  );
};

