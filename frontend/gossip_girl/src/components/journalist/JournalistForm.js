import React from 'react';

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
      <input type="text" placeholder="first name" name="first_name"/>
      <input type="text" placeholder="last name" name="last_name"/>
      <input type="text" placeholder="field" name="field"/>
      <button type="submit">Save</button>
      </form>
    </div>
  )
}

export default JournalistForm;
