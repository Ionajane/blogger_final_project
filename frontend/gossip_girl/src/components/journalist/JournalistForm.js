import React, { Component } from 'react';

// class JournalistForm extends Component  {
//   constructor() {
//     super();
//     this.state = {
//       first_name: "",
//       last_name: "",
//       field: ""
//     }
//
//     this.handleFNameChange = this.handleFNameChange.bind(this);
//     this.handleLNameChange = this.handleLNameChange.bind(this);
//     this.handleFieldChange = this.handleFieldChange.bind(this);
//     this.handleSubmit = this.handleSubmit.bind(this);
//   }
//
//   handleFNameChange(event) {
//     const first_name = event.target.value;
//     this.setState({first_name: first_name});
//   }
//
//   handleLNameChange(event) {
//     const last_name = event.target.value;
//     this.setState({last_name: last_name});
//   }
//
//   handleFieldChange(event) {
//     const field = event.target.value;
//     this.setState({field: field});
//   }
//
//   handleSubmit(event) {
//     event.preventDefault();
//     const  {first_name, last_name, field} = this.state;
//
//     if (!first_name || !field) {
//       return;
//     }
//
//     this.props.handleJournalistPost( {first_name: first_name, last_name: last_name, field: field} );
//     this.setState( {first_name: "", last_name: "", field: ""} );
//   }

const JournalistForm = (props) => {

  function handleSubmit(event){
    event.preventDefault();
    const journalist = {
      "first_name": event.target.first_name.value,
      "last_name": event.target.last_name.value,
      "field": event.target.field.value
    }

    props.handleJournalistPost(journalist)
  }

    return (
      <div className="add-journalist">
        <form onSubmit={handleSubmit}>
        <h1> ADD A NEW BLOGGER </h1>
        <input type="text" placeholder="first name" name="first_name" />
        <input type="text" placeholder="last name" name="last_name" />
        <input type="text" placeholder="field" name="field" />
        <button type="submit" value="Post">Save</button>
        </form>
      </div>
    )


}

export default JournalistForm;
