import React, { Component } from 'react';

class Table extends Component {
	constructor(props){
		super(props);
		this.state = {
			table: []
		};
	}

	componentWillReceiveProps(nextProps){
		const url = 'http://localhost:8080/table?no='+nextProps.no;
		if(nextProps.no){
		fetch(url)
		.then(tables => tables.json())
		.then(tables => this.setState({table: tables}))
		}
	else{
		this.setState({table: []});
	}

	}

	
  render() {
  	
  	const {no} = this.props;
    return (
      <div>
      	table of {no}
      	<br/>
      	{this.state.table.map((tables, i) => 
      			<li key={tables.toString()}>{no} * {++i} = {tables}</li>)}
      </div>
    );
  }
}

export default Table;
