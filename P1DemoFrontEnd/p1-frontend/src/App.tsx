import React from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Login } from './Components/LoginRegister/Login';
import { Register } from './Components/LoginRegister/Register';

function App() {
  return (
    <div className="App">
        <BrowserRouter>
          <Routes>
            {/*blank path makes this component render at startup*/}
            <Route path="" element={<Login/>} /> 
            <Route path="/register" element={<Register/>}/>
          </Routes>
        </BrowserRouter>
    </div>
  );
}

export default App;
