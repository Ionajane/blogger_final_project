import React, { Component } from 'react';

const JournalistForm = (props) => {

  function handleSubmit(event){
    event.preventDefault();
    console.log("test", event.target.first_name.value);
    const journalist = {
      "fName": event.target.first_name.value,
      "lName": event.target.last_name.value,
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
