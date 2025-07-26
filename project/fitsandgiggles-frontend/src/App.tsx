import React from 'react';
import logo from './logo.svg';
import './App.css';



function App() {
        console.log("WE OUT HERE")
        const [data, setData] = React.useState<string | null>(null);
        React.useEffect(() => {
          fetch('http://localhost:8080/api/items')
            .then(response => response.json())
            .then(json => setData(json.message))
            .catch(error => console.error('Error fetching data:', error));
        }, []);

        console.log("Data fetched:", data);

        <p>{data ? data : 'Loading...'}</p>


  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          FitsAndGiggles
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Sample
        </a>
      </header>
    </div>
  );
}

export default App;
