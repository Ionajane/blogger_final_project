import React from 'react';

const JournalistForm = (props) => {

  function handleSubmit(event){
    event.preventDefault();

    const journalist = {
      "fName": event.target.fName.value,
      "lName": event.target.lName.value,
      "field": event.target.field.value
    }

    props.handleJournalistPost(journalist)
  }


  return (
    <div className="add-journalist">
      <form onSubmit={handleSubmit}>
      <h1> ADD A NEW BLOGGER </h1>
      <input type="text" placeholder="first name" name="fName"/>
      <input type="text" placeholder="last name" name="lName"/>
      <input type="text" placeholder="field" name="field"/>
      <button type="submit">Save</button>
      </form>
    </div>
  )
}

export default JournalistForm;
