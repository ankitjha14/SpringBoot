import React, { Component } from 'react';
import './App.css';
import Table from './Table'



class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      no : 0
    };
    this.handleInput = this.handleInput.bind(this);
    this.handle = this.handle.bind(this);
  }

  handleInput(event){
    this.setState({
      no: event.target.value
    })
  }
  handle(event){
    event.preventDefault();
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <h1 className="App-title">Tables</h1>
              Enter Number : <input type="number" name="name" value={this.state.no} onChange={this.handleInput}/>
        </header>
        <Table no = {this.state.no}/>
      </div>
    );
  }
}

export default App;
