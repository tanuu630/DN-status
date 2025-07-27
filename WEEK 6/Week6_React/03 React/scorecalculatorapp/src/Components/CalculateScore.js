import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
    const average = (props.total / props.goal) * 100;

    return (
        <div className="score-container">
            <h2>Student Details:</h2>
            <p className="score-text"><span className="name">Name:</span> {props.name}</p>
            <p className="score-text"><span className="school">School:</span> {props.school}</p>
            <p className="score-text"><span className="total">total:</span> {props.total} Marks</p>
            <p className="score-text"><span className="score">Score:</span> {average.toFixed(2)}%</p>
        </div>
    );
}

export default CalculateScore;
