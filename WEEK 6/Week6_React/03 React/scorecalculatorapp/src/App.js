import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
    return (
        <div className="App">
            <CalculateScore
                name="Tanu"
                school="Bhopal Public School"
                total={440}
                goal={500}
            />
        </div>
    );
}

export default App;
