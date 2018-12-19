import React from 'react';
import Journalist from './Journalist.js';

const JournalistList = (props) => {
  console.log("JournalistList L5  props:", props);
  const journalists = props.journalists.map((journalist) => {
    return (
      <li key={journalist.id} className="journalist-component-item">
        <div className= "journalist-component">
          <Journalist article={journalist.article} journalist={journalist} />
        </div>
      </li>
    )
  })

  return (
    <ul className="journalist-component-item">
    {journalists}
    </ul>
  )
}

export default JournalistList;
