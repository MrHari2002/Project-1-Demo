import React from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { LoginComponent } from './Components/LoginRegister/LoginComponent';
import { RegisterComponent } from './Components/LoginRegister/RegisterComponent';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="login" element={<LoginComponent />} />{ /* Blank path makes this component render at start up */}
          <Route path="/register" element={<RegisterComponent />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;